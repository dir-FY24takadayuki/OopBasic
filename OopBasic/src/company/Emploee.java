package company;

public class Emploee {
    //フィールド
    String name;
    String department;
    String position;
    int employeeId;
    
    //コンストラクター
    public void Employee(String name, String department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }
    //報告メソッド
    public void report (int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "名前：" + name);
    }
    
    //報告メソッド」（オーバーロード） reportという名前のメソッドは一つ上でも使った
    public void report() {
        report(1);
    }
}
