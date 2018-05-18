package core;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Poker extends JFrame {
    public void CreateJFrame(String title){
        JFrame jf=new JFrame(title);
        Container container=jf.getContentPane();//获取一个容器
        JLabel jl=new JLabel("这是一个JFrame窗体");//创建一个JLabel标签
        jl.setHorizontalAlignment(SwingConstants.CENTER);//使标签上的文字居中
        container.add(jl);//将标签添加到容器中
        container.setBackground(Color.white); //设置容器的背景颜色
        jf.setVisible(true);//使窗口可视
        jf.setSize(200, 150);//设置窗体大小
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗体关闭方式
    }
    public static void main(String args[]){
        new Poker().CreateJFrame("创建一个JFrame窗体");  //在主方法中调用CreatJFrame()方法
    }
}