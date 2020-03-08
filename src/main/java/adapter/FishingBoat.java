package adapter;


import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

final class FishingBoat {

  private static final Logger LOG = getLogger(FishingBoat.class);

  void sail() {
    LOG.info("The fishing boat is sailing");
  }
}
