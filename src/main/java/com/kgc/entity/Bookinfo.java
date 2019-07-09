package com.kgc.entity;

import java.util.Date;

public class Bookinfo {
    private Integer bookid;

    private String bookcode;

    private String bookname;

    private String booktype;

    private String bookauthor;

    private String publishpress;

    private Date publishdate;

    private String isborrow;

    private String vreatedby;

    private Date creationtime;

    private Date lastupdatetime;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode == null ? null : bookcode.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype == null ? null : booktype.trim();
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor == null ? null : bookauthor.trim();
    }

    public String getPublishpress() {
        return publishpress;
    }

    public void setPublishpress(String publishpress) {
        this.publishpress = publishpress == null ? null : publishpress.trim();
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public String getIsborrow() {
        return isborrow;
    }

    public void setIsborrow(String isborrow) {
        this.isborrow = isborrow == null ? null : isborrow.trim();
    }

    public String getVreatedby() {
        return vreatedby;
    }

    public void setVreatedby(String vreatedby) {
        this.vreatedby = vreatedby == null ? null : vreatedby.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}