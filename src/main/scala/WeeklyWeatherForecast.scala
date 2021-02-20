case class WeeklyWeatherForecast(temperature: Seq[Double]) {

  private def converterCtoF(temp: Double) = temp * 1.8 + 31

  def forecastInFahrenheit: Seq[Double] = temperature.map(converterCtoF)

}
