import java.awt.*;
class pull_down_menu{
    pull_down_menu(){
        Frame f= new Frame("Menu and MenuItem Example");
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("BCA II SEM SUBJECTS");
        Menu submenu=new Menu("Java");
        MenuItem i1=new MenuItem("NSM");
        MenuItem i2=new MenuItem("CA");
        MenuItem i3=new MenuItem("DS");
        MenuItem i4=new MenuItem("JAVA THEORY");
        MenuItem i5=new MenuItem("JAVA LAB");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new pull_down_menu();
    }
}