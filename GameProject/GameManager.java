public class GameManager implements GameService {

    @Override
    public void campaing(Campaign campaing, Game game) {

        System.out.println(game.getGameName()+"Adl oyunda yeni kampanya=>"+campaing.getCampaignName()+"Kampanya seçeneðiyle");
    }

    @Override
    public void add(Game game) {

        System.out.println(game.getGameName() + " Eklendi");
    }

    @Override
    public void update(Game game) {

        System.out.println(game.getGameName() + " Guncellendi");
    }

    @Override
    public void delete(Game game) {

        System.out.println(game.getGameName() + " Silindi");
    }

}