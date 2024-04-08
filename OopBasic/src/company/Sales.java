package company;

public class Sales extends EmployeePractice{
    //コンストラクター
    public Sales(String name, Department department, String position, int employeeId) {
        super(name, department, position, employeeId);
        //抽象型のコンストラクターをそのまま使用
    }
    
    //会議に参加するメソッド
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("→営業として、上記の会議に参加します。部署名：" + department.getName() + "名前：" + name);
    }

}
