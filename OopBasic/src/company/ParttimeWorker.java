package company;

public class ParttimeWorker implements Workable{
    //フィールド
    protected final String name;
    private final Department department;
    
    //コンストラクター
    public ParttimeWorker(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    
    //メソッド
    @Override
    public void work() {
        //実際の動作のプログラムは具象クラスで書く
        System.out.println("アルバイトとして働きます。名前：" + name + slogan);
    }

}
