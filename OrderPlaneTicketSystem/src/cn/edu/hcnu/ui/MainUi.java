package cn.edu.hcnu.ui;

import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.bll.Impl.IFlightServiceImpl;
import cn.edu.hcnu.dto.Flight;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有的航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预定");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");
            int choice = scanner.nextInt();
            if(choice==1){
                String UUid = UUID.randomUUID().toString();
                String id = UUid.replace("-", "");
                System.out.println(id);
                System.out.println("请输入航班编号");
                String frightId = scanner.next();
                System.out.println("请输入航班座位数");
                int currentSeats = scanner.nextInt();
                System.out.println("请输入飞机类型");
                String planeType = scanner.next();
                System.out.println("请输入出发机场");
                String departrueAirport = scanner.next();
                System.out.println("请输入到达机场");
                String destinationAirport = scanner.next();
                System.out.println("请输入出发时间");
                String departrueTime = scanner.next();
                Flight flight = new Flight(frightId, currentSeats, planeType,
                        departrueAirport, destinationAirport, departrueTime);
                flight.setId(id);
                IFlightService iFlightService = new IFlightServiceImpl();
                try {
                    iFlightService.insertFlight(flight);
                } catch (SQLException e) {
                    String erroMessage = e.getMessage();
                    String erro = erroMessage.substring(0, 9);
                    System.out.println(erro);
                    System.out.println(erroMessage);

                    if (erroMessage.startsWith("ORA-12899")) {
                        //定义正则表达式的规则
//                     ORA-12899: 列 "OPTS"."FLIGHT"."ID" 的值太大 (实际值: 32, 最大值: 30)
                        String pattern = "\\.(\"\\w+\")\\.(\"\\w+\")";
                        //创建Pattern对象
                        Pattern r = Pattern.compile(pattern);
                        //创建matcher对象
                        Matcher m = r.matcher(erroMessage);
                        if (m.find()) {
                            System.out.println(m.group(1));
                            System.out.println(m.group(2));
                        }
                    }


                }
            }else if(choice==2){
                IFlightService iFlightService=new IFlightServiceImpl();
                Set<Flight> allFlights = null;
                try {
                    allFlights = iFlightService.getAllFlight();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                for (Flight flight:allFlights){
                    System.out.println(flight);
                }
            }


        }
    }
}
