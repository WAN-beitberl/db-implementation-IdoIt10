import java.util.*;

public class person{
    String name;
    String last_name;
}

public class Table{

    String [2] col;
    Person [] row;

    static void InsertColNames(String name, String last_name){
        this.col[0].name = name;
        this.col[1].last_name = lastname;
    }

    static void InsertRow(String name, String last_name){

        int i = 0;

        while(this.row[i] != null){
            i++;
        }
        
        this.row[i].name = firstname;
        this.row[i].last_name = lastname;
    }

    static String GetValue(String name, int row){
        if (this.row[row].name == name){
            return this.row[row].last_name;
        }
        return null;
    }
}

public static void main(String[] args){

    Table table = New Table();

    table.InsertColNames("name", "last_name");
    table.InsertRow("Israel", "Israeli");

    Srting name = Table.GetValue("name", 0);
    System.out.println(name);
}