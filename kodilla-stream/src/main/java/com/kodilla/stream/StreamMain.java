package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier beautifier = new PoemBeautifier();

        PoemDecorator addABC = text -> "ABC" + text + "ABC";
        PoemDecorator toUpperCase = String::toUpperCase;
        PoemDecorator add123 = text -> text + "123";
        PoemDecorator reverse = text -> new StringBuilder(text).reverse().toString();

        beautifier.beautify("Sample text", addABC);
        beautifier.beautify("Another sample text", toUpperCase);
        beautifier.beautify("Custom text", add123);
        beautifier.beautify("Reverse me", reverse);


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


        People.getList().stream()
                .map(String::toUpperCase)                             // [1]
                .filter(s -> s.length() > 11)                         // [2]
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3]
                .filter(s -> s.substring(0, 1).equals("M"))           // [4]
                .forEach(System.out::println);                        // [5]




        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]

        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);


        BookDirectory theBookDirectory2 = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory2.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);

        //Zadanie 7.3
        Forum forum = new Forum();
        forum.addUser(new ForumUser(1, "John", 'M', LocalDate.of(1990, 5, 15), 3));
        forum.addUser(new ForumUser(2, "Alice", 'F', LocalDate.of(1985, 10, 20), 0));
        forum.addUser(new ForumUser(3, "Bob", 'M', LocalDate.of(2000, 8, 8), 1));
        forum.addUser(new ForumUser(4, "Emily", 'F', LocalDate.of(1992, 3, 25), 5));

        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> user.getDateOfBirth().plusYears(20).isBefore(LocalDate.now()))
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        resultMap.forEach((key, value) -> System.out.println("User ID: " + key + ", User: " + value));


    }
}