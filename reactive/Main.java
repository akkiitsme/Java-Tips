package org.reactive;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        //1 - print all the numbers
        StreamSources.intNumbersStream().forEach(System.out::println);

        //2 - print numbers in intNumbersStream that's less than 5
        StreamSources.intNumbersStream().filter(x-> x<5)
                .forEach(System.out::println);

        //3 - print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream().filter(x->x>5)
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

        //4 - Print the first number in intNumbersStream that's greater than 5. If nothing found ,print -1
        Integer  value = StreamSources.intNumbersStream().filter(x->x>5).findFirst().orElse(-1);
        System.out.println(value);

        //5 - Print username of all users in UserStream
        StreamSources.userStream().map(User::getUsername).forEach(System.out::println);

        //6 - Print first username in UserStream for users that have IDs from intNumbersStream
        
        //**first Approach
        StreamSources.intNumbersStream()
                .flatMap(x->StreamSources.userStream().filter(user -> user.getId()==x))
               // .map(User::getUsername)
                .forEach(value1-> System.out.println(value1));

        //**Second Approach
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream()
                .anyMatch(id->id==user.getId()))
                .forEach(System.out::println);

    }
}