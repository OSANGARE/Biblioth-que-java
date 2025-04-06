public class Member {
    private String name;
    private String memberId;
    private int penaltyDays;  // Nouveau champ

    // Constructeur modifié
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.penaltyDays = 0;
    }

    // Nouvelle méthode
    public void addPenalty(int days) {
        this.penaltyDays += days;
        System.out.println(this.name + " a reçu " + days + " jours de pénalité");
    }

    // Getter
    public int getPenaltyDays() {
        return this.penaltyDays;
    }
}
