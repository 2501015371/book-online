package com.bo.service;

import com.bo.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author ty
 * @ClassName BookService
 * @Description 图书业务逻辑类
 * @Date 2019/10/2
 * @Version 1.0
 **/
public class BookService {

    public static List<Book> init() {
        List<Book> bookList = new ArrayList<>(10);
        Book[] books = {
                new Book(1, "随身带个抽奖面板", "b1.jpg", "再入江湖"),
                new Book(2, "明天下", "b2.jpg", "子宇二"),
                new Book(3, "战国大司马", "b3.jpg", "贼宗首席"),
                new Book(4, "怪物来了", "b4.jpg", "菜包配咖啡"),
                new Book(5, "长生种", "b5.jpg", "月中阴"),
                new Book(6, "手术直播间", "b6.jpg", "镇雄除魔"),
                new Book(7, "不合格的大魔王", "b7.jpg", "伊梦黄粱"),
                new Book(8, "星辰变", "b8.jpg", "我吃西红柿"),
                new Book(9, "仓元图", "b9.jpg", "我吃西红柿"),
                new Book(10, "最强弃少", "b10.jpg", "鹅是老五")
        };
        bookList = Arrays.asList(books);
        return bookList;
    }


}
