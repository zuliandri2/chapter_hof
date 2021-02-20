object hof {

  def main(args: Array[String]): Unit = {

    val showing = (txt: Int) => println(txt)

    val salaries = Seq(20000, 70000, 40000)
    val doubleSalaries = (x: Int) => 2 * x
    val newSalaries = salaries.map(doubleSalaries)
    newSalaries.foreach(show)

    println("=========")
    //or
    val nSalareis = salaries.map(x => x * 2)
    nSalareis.foreach(show)

    println("=========")
    //or
    val salary = salaries.map(_ * 2)
    salary.foreach(showing)

    val  domainName = "www.zuliandri.com"

    def getURL = urlBuilder(true, domainName)
    val endPoint = "users"
    val query = "id=1"
    val url = getURL(endPoint, query)
    println(url)

    val celcius = Seq(23.8,45.8,23.3,67.4,3.5)
    val weekWeather = new WeeklyWeatherForecast(celcius)
    weekWeather.forecastInFahrenheit.foreach(i => println(i))
  }

  def show = (i: Int) => println(i)

  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {

    val schema = if (ssl) "https://" else "http://"
    (endPoint: String, query: String) => s"$schema$domainName/$endPoint?$query"

  }

}
