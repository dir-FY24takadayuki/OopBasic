package company;

public class Emploee implements Workable {
    //フィールド
    protected String name;
    private Department department;
    private String position;
    private int employeeId;
    
    //コンストラクター
    public void Emploee(String name, Department department, String position, int employeeId) {
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
    @Override
    public void work() {
        System.out.println("正社員として働きます。名前：" + name + slogan);
        
    }
}
