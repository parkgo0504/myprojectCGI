package 추상클래스;

public class Worker {
    private String name;
    private int hourPay;    //시급
    private int workHour;    //근무시간
    
    //생성자
    //생성자 자동완성 alt + shift + s, o
    public Worker() {}
    public Worker(String name, int hourPay, int workHour) {
        setName(name);
        setHourPay(hourPay);
        setWorkHour(workHour);
    }
    
    //급여계산 메서드
    //월급 = 시급 * 1일 근무시간 * 20일
    //시급 = 시급 * 1일 근무시간 * 근무일 수 
    public int getPay() {
        return getHourPay() * getWorkHour();
    }
    
    public void showInfo() {
        System.out.println("이름 : " + getName());
        System.out.println("급여 : " + getPay());
    }
 
    //자동완성 alt + shift + s, r
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHourPay() {
        return hourPay;
    }
    public void setHourPay(int hourPay) {
        this.hourPay = hourPay;
    }
    public int getWorkHour() {
        return workHour;
    }
    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }
}