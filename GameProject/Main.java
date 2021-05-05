import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        User user1=new User(1,"Batuğhan","1904040", LocalDate.of(1999, 1, 1));

        UserManager userManager=new UserManager(new EdevletManager());
        userManager.register(user1);
        userManager.login(user1);
        userManager.delete(user1);

        Campaign campaing1=new Campaign(1,"İndirim",43);

        CampaignManager campaignManager=new CampaignManager();
        campaignManager.add(campaing1);
        campaignManager.delete(campaing1);
        campaignManager.update(campaing1);

        Game game1=new Game(1,"Sims4",420);

        GameManager gameManager=new GameManager();
        gameManager.add(game1);
        gameManager.delete(game1);
        gameManager.update(game1);

        gameManager.campaing(campaing1, game1);



    }
}