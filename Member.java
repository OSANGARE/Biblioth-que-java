public class Member {
    private String name;
    private String memberId;
    
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getMemberId() {
        return memberId;
    }
}
