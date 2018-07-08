package com.shang.dp;

import java.io.*;
import java.util.Date;

public class WuKong extends Monkey implements Cloneable,Serializable{
    public JinGuBang bang;
    public WuKong(){
        this.bang = new JinGuBang();
        this.setHeight("200cm");
        this.setWeight("200kg");
        this.setBirthday(new Date());
    }

    /**
     * 深克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            //将当前对象写入字节数据数据流
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            WuKong copy = (WuKong)ois.readObject();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    protected Object clone1() throws CloneNotSupportedException {
        WuKong wuKong = (WuKong)super.clone();
        wuKong.bang = (JinGuBang)bang.clone();
        return wuKong;
    }

}
