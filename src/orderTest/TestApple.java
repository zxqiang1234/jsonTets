package orderTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @description:
 * @author: xuqiang
 * @createDate: 2019-01-21 11:04
 **/
public class TestApple {
    public static void main(String[] args) throws ParseException {
        Set<String> stringSet=new HashSet<>();
        stringSet.add("aaa");
        stringSet.add("aaa");
        stringSet.add("ssss");
        for (String aa:stringSet){
            System.out.println(aa);
        }

        List<Apple> students = new ArrayList<>();

        students.add(new Apple(1,"ss",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));
        students.add(new Apple(1,"ss",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-21 23:25:21")));

        List<Apple> list = new ArrayList<>();
        list.add(new Apple(1,"ss",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));
        list.add(new Apple(1,"ss",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));
        list.add(new Apple(2,"22",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));
        list.add(new Apple(1,"ss",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));
        list.add(new Apple(2,"222",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));
        list.add(new Apple(1,"ss",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));
        list.add(new Apple(1,"ss",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));
        list.add(new Apple(1,"ss",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));
        list.add(new Apple(3,"333",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));
        list.add(new Apple(2,"ss",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21")));

        Map<Integer, List<Apple>> map = new HashMap<>();
        for(Apple user : list){
            if(map.containsKey(user.getWeight())){
                //map中存在此id，将数据存放当前key的map中
                map.get(user.getWeight()).add(user);
            }else{//map中不存在，新建key，用来存放数据
                List<Apple> tmpList = new ArrayList<>();
                tmpList.add(user);
                map.put(user.getWeight(), tmpList);
            }
        }


//         students.stream().collect(Collectors.toList(Apple::getColor));

















//List<Apple> appleLists=new ArrayList<>();
//Apple apple1=null;
//                for(int i=0;i<1000000;i++){
//                    apple1=    new Apple(i,"ss",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-11 23:25:21"));
//                    appleLists.add(apple1);
//                }
//        long startTimesss = System.currentTimeMillis();
//        long count = appleLists.stream().filter(num -> 10 >= num.getWeight()).count();
//        long endTimesss = System.currentTimeMillis();
//        System.out.println("程序统计运行时间："+(endTimesss - startTimesss)+"ms");



//        long startTimes = System.currentTimeMillis();
//        Optional<Apple> first = appleLists.stream().filter(num -> 10 == num.getWeight()).findFirst();
////        List<Apple> collect1 = first
//        long endTimes = System.currentTimeMillis();
        //        System.out.println("程序运行时间："+(endTimes - startTimes)+"ms");
//        long startTimese = System.currentTimeMillis();
//        List<Apple> appleList=new ArrayList<>(16);
//        for (Apple apple: appleList){
//            if (10==apple.getWeight()){
//                appleList.add(apple);
//            }
//        }
//        long endTimese = System.currentTimeMillis();
//        System.out.println("程序运行时间："+(endTimese - startTimese)+"ms");


//        System.out.println(count);
//        Collections.sort(appleLists,Comparator.comparing(Apple::getWeight).thenComparing(Apple::getBirthDay).reversed());
//        for (Apple apple:appleLists){
//            System.out.println(apple);
//        }


    }
}
