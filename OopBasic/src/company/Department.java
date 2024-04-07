package company;

public class Department {
    private final String name;
    private final String departmentId;
    private int budget;
    
    //コンストラクター
    //PC上での意味としては、nameと対応しているアドレスが指し示すnameをこのオブジェクトのnameに格納する
    public Department(String name, String departmentId, int budget) {
        this.name = name;
        this.departmentId = departmentId;
        this.budget = budget;
    }
    //手続きmeetingの定義
    ///手続きmeetingは戻り値はないのでvoidを入れる。
    public void meeting() {
        System.out.println("部内会議を開催します。部署:"+ name + "、予算:" + budget);
    }
    
    //印字ではなく、文字列として戻り値がほしいから、手続き名の前に戻り値のデータ型を記述
    //戻してほしいものをreturn + の形で書く
    public String getName() {
        return name;
    }

    
    public double getBudget() {
        return budget;
    }
    
    //手続き内に、条件分岐が含まれている。引数が0より小さくない場合はオブジェクトのbudgetに引数に入れた値が格納される。、
    public void setBudget(int budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("予算はマイナスにできませ。");
        }
        this.budget = budget;
    }
}
