package builder;

public final class Hero {

  private final String name;
  private final Armor armor;
  private final HairColor hairColor;
  private final HairType hairType;
  private final Profession profession;
  private final Weapon weapon;

  public Hero(Builder builder) {
    this.name = builder.name;
    this.armor = builder.armor;
    this.hairColor = builder.hairColor;
    this.hairType = builder.hairType;
    this.profession = builder.profession;
    this.weapon = builder.weapon;
  }

  public String getName() {
    return name;
  }

  public Armor getArmor() {
    return armor;
  }

  public HairColor getHairColor() {
    return hairColor;
  }

  public HairType getHairType() {
    return hairType;
  }

  public Profession getProfession() {
    return profession;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("This is a ")
        .append(profession)
        .append(" named ")
        .append(name);

    if (hairColor != null || hairType != null) {
      sb.append(" with ");
      if (hairColor != null) {
        sb.append(hairColor).append(" ");
      }
      if (hairType != null) {
        sb.append(hairType).append(" ");
      }
    }
    sb.append(hairType != HairType.BALD ? "hair" : "head");
    if (armor != null) {
      sb.append(" wearing ").append(armor);
    }
    if (weapon != null) {
      sb.append(" and wielding a ").append(weapon);
    }
    sb.append(".");
    return sb.toString();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {

    private String name;
    private Profession profession;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;

//    public Builder(String name, Profession profession) {
//      if (profession == null || name == null) {
//        throw new IllegalArgumentException("profession and name couldn't be null");
//      }
//      this.name = name;
//      this.profession = profession;
//    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withProfession(Profession profession) {
      this.profession = profession;
      return this;
    }

    public Builder withHairType(HairType hairType) {
      this.hairType = hairType;
      return this;
    }

    public Builder withHairColor(HairColor hairColor) {
      this.hairColor = hairColor;
      return this;
    }

    public Builder withArmor(Armor armor) {
      this.armor = armor;
      return this;
    }

    public Builder withWeapon(Weapon weapon) {
      this.weapon = weapon;
      return this;
    }

    public Hero build() {
      return new Hero(this);
    }
  }
}
