package jm.study.book.effectivejava.item2_1;


import lombok.ToString;

@ToString
public class HttpComponentV5<T extends HttpUnit> {
    private final String common_aaa;
    private final String common_bbb;

    private final String aa;
    private final String bb;
    private final String cc;

    private static HttpComponentV5 T_HTTP_COMPONENT;
    private static HttpComponentV5 P_HTTP_COMPONENT;

    private HttpComponentV5(T a) {
        common_aaa = "COMMON_AAA";
        common_bbb = "COMMON_BBB";

        this.aa = a.getParamA();
        this.bb = a.getParamB();
        this.cc = a.getParamC();
    }

    public static <K extends HttpUnit> HttpComponentV5 getInstance(K a){

        if(a.getHttpMode().equals(HttpUnit.HttpModeEnum.TEST)){
            if(T_HTTP_COMPONENT == null){
                T_HTTP_COMPONENT = new HttpComponentV5<K>(a);
            }
            return T_HTTP_COMPONENT;
        }else {
            if (P_HTTP_COMPONENT == null) {
                P_HTTP_COMPONENT = new HttpComponentV5<K>(a);
            }
            return P_HTTP_COMPONENT;
        }

//        if(a.getHttpMode().equals(HttpUnit.HttpModeEnum.TEST)){
//            if(T_HTTP_COMPONENT == null){
//                T_HTTP_COMPONENT = new HttpComponentV5<K>(a);
//            }
//            return T_HTTP_COMPONENT;
//        }else {
//            if (P_HTTP_COMPONENT == null) {
//                P_HTTP_COMPONENT = new HttpComponentV5<K>(a);
//            }
//            return P_HTTP_COMPONENT;
//        }
    }
}
