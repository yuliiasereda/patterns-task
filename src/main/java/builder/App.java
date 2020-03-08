package builder;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

public class App {

  private static final Logger LOG =  getLogger(App.class);

  public static void main(String[] args) {
    Hero mage = Hero.builder()
        .withName("Riobard")
        .withProfession(Profession.MAGE)
        .withHairColor(HairColor.BLACK)
        .withWeapon(Weapon.DAGGER)
        .build();

    LOG.info(mage.toString());
  }
}
