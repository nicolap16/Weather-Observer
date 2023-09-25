public class WarningWatcher extends WeatherObserver {

  private String countryWatched;
  private WeatherRecorder theRecorder;

  public WarningWatcher(WeatherRecorder aWeatherRecorder, String countryToWatch) {
    theRecorder = aWeatherRecorder;
    countryWatched = countryToWatch;
    theRecorder.attach(this);
  }

  public void update() {

    System.out.println("An update has been issued.");

    if((theRecorder.getUpdateType().contains("Warning")) && (theRecorder.getUpdateCountry().contains(countryWatched))){
            System.out.println("\nThe WarningWatcher watching for Warnings for " +
                         countryWatched +
                         "\nhas noticed a new warning:\n\"" +
                         theRecorder.getUpdateText() + "\"\n");
    }
  }

}
