package company;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンスの作成
        //Department型とEmployeePractice型のクラスからできた2つのオブジェクト
        var department = new Department("営業部", "xx", 1000000);
        var employee = new EmployeePractice("鈴木", department, "課長", 100);
                
                //オブジェクトだからメソッドが使える
                employee.report();
                employee.report(2);
                employee.joinMeeting();
                
                //1行空ける
                System.out.println("");
                
                //インスタンスの作成
                //devDepartmentはDepartmentのオブジェクト
                //engineerはEmployeePracticeのオブジェクト
                var devDepartment = new Department("開発部", "yy", 0);
                var engineer = new EmployeePractice("田中", devDepartment, "一般社員", 88);
                
                //インスタンスメソッドの呼び出し
                //engineerというのは、EmployeePracticeのオブジェクトゆえ、メソッドを持ち合わせている。
                engineer.report();
                engineer.joinMeeting();
    }

}
