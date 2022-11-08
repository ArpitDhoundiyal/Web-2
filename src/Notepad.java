import java.awt.*;
class Notepad
{
    Notepad(){
        Frame f= new Frame("Notepad");
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("File");
        //Menu submenu=new Menu("Sub Menu");
        MenuItem i1=new MenuItem("New");
        MenuItem i2=new MenuItem("New Window");
        MenuItem i3=new MenuItem("open");
        MenuItem i4=new MenuItem("Save");
        MenuItem i5=new MenuItem("Save as");
        MenuItem i6=new MenuItem("Page Setup");
        MenuItem i7=new MenuItem("Print");
        MenuItem i8=new MenuItem("Exit");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        menu.add(i6);
        menu.add(i7);
        menu.add(i8);
        //menu.add(submenu);

        Menu edit=new Menu("Edit");
        //Menu submenu=new Menu("Sub Menu");
        MenuItem e1=new MenuItem("Undo");
        MenuItem e2=new MenuItem("Cut");
        MenuItem e3=new MenuItem("Copy");
        MenuItem e4=new MenuItem("Paste");
        MenuItem e5=new MenuItem("Delete");
        MenuItem e6=new MenuItem("Find");
        MenuItem e7=new MenuItem("Find next");
        MenuItem e8=new MenuItem("Find previous");
        MenuItem e9=new MenuItem("Replace");
        MenuItem e10=new MenuItem("Go to");
        MenuItem e11=new MenuItem("Select all");
        MenuItem e12=new MenuItem("Time/Date");
        MenuItem e13=new MenuItem("Font");
        edit.add(e1);
        edit.add(e2);
        edit.add(e3);
        edit.add(e4);
        edit.add(e5);
        edit.add(e6);
        edit.add(e7);
        edit.add(e8);
        edit.add(e9);
        edit.add(e10);
        edit.add(e11);
        edit.add(e12);
        edit.add(e13);

        //view
        Menu view =new Menu ("View");
       // MenuItem v1=new MenuItem("Zoom");
        MenuItem v2=new MenuItem("Status bar");
        MenuItem v3=new MenuItem("Word wrap");
        Menu Zoom=new Menu("Zoom");
        MenuItem v4=new MenuItem("Zoom in");
        MenuItem v5=new MenuItem("Zoom Out");
        MenuItem v6=new MenuItem("Restore default zoom");



        view.add(Zoom);
        Zoom.add(v4);
        Zoom.add(v5);
        Zoom.add(v6);

        view.add(v2);
        view.add(v3);




        mb.add(menu);
        mb.add(edit);
        mb.add(view);



        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new Notepad();
    }
}
