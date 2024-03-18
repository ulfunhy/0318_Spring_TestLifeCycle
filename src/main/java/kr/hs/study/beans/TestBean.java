package kr.hs.study.beans;

public class TestBean {
    public TestBean() {
        System.out.println("TestBean의 기본 생성자");
    }
    public  void initMethod() {
        System.out.println("생성자 실행후에 자동으로 실행되는 TestBena의 initMethod");
    }

    public void destroyMethod() {
        System.out.println("destroy");
    }
}
