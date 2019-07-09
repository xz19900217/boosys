package com.kgc.untils;

public class BookinfoParam {
    private String booktype;
    private String bookname;
    private String isborrow;

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getIsborrow() {
        return isborrow;
    }

    public void setIsborrow(String isborrow) {
        this.isborrow = isborrow;
    }

    @Override
    public String toString() {
        return "BookinfoParam{" +
                "booktype='" + booktype + '\'' +
                ", bookname='" + bookname + '\'' +
                ", isborrow='" + isborrow + '\'' +
                '}';
    }
}
