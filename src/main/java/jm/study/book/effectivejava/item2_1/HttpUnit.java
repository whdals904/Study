package jm.study.book.effectivejava.item2_1;

public interface HttpUnit {

    static enum HttpModeEnum {
        TEST, PRODUCTION
    }

    public HttpModeEnum getHttpMode();
    public String getParamA();
    public String getParamB();
    public String getParamC();
    public String getParamD();

}
