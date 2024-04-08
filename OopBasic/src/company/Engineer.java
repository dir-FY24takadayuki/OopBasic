package company;

public class Engineer extends EmployeePractice{
    

    //新たに追加するフィールドを書いている
    String programmingLanguage;
    
    //既存のコンストラクタの活用と新たなコンストラクタ
    public Engineer(String name, Department department, String position, int employeeId,
            String progtammingLanguage) {
        super(name, department, position, employeeId);
        this.programmingLanguage = progtammingLanguage;
        // この辺のコンストラクタを書くときは大文字と小文字は注意しないといけない。
    }
    
    public void developSoftware() {
        System.out.println("ソフトウェアを開発します。名前:" + name +"プログラミング言語：" + programmingLanguage);
    }
    
    //会議に参加するメソッドをoverride
    @Override
    public void joinMeeting() {
        //親クラスのなんのメソッドを置き換えるのかをsuper.メソッドで定義
        department.meeting();
        
        System.out.println("→技術的な準備を行い、上記の会議に参加します。名前:" + name);
    }
}
