public class main {
    public static void main(String[] args) {
          Weather weatherBox = new Weather();
          System.out.println("Day of the Week:" + weatherBox.day_of_week);
          System.out.println("Temperature:" + weatherBox.degrees);
          System.out.println("Precipitation:" +weatherBox.meteorological_precipitation);
          System.out.println("Wind speed:"+weatherBox.wind_speed_m_per_sec);
          System.out.println("Atmosphere Pressure:" +weatherBox.atmosphere_pressure_);
          System.out.println( "How it is Outside? -  "+ weatherBox.weather_overall_description);

    Weather weatherBox2 = new Weather();

        weatherBox2.day_of_week = "Tuesday";
        weatherBox2.degrees = -5;
        weatherBox2.meteorological_precipitation = "Snowy";
        weatherBox2.wind_speed_m_per_sec = 12;
        weatherBox2.atmosphere_pressure_ = 1000.7;
        weatherBox2.weather_overall_description = "Cold weather with snow";

        System.out.println("Day of the Week:" + weatherBox2.day_of_week);
        System.out.println("Temperature:" + weatherBox2.degrees);
        System.out.println("Precipitation:" +weatherBox2.meteorological_precipitation);
        System.out.println("Wind speed:"+weatherBox2.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +weatherBox2.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ weatherBox2.weather_overall_description);

        Weather weatherBox3 = new Weather();


        weatherBox3.day_of_week = "Wednesday";
        weatherBox3.degrees  = 27;
        weatherBox3.meteorological_precipitation = "Sunny";
        weatherBox3.wind_speed_m_per_sec = 3;
        weatherBox3.atmosphere_pressure_ = 1017.7;
        weatherBox3.weather_overall_description = "Excellent weather for swimming";

        System.out.println("Day of the Week:" + weatherBox3.day_of_week);
        System.out.println("Temperature:" + weatherBox3.degrees);
        System.out.println("Precipitation:" +weatherBox3.meteorological_precipitation);
        System.out.println("Wind speed:"+weatherBox3.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +weatherBox3.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ weatherBox3.weather_overall_description);

        Weather weatherBox4 = new Weather();


        weatherBox4.day_of_week = "Thursday";
        weatherBox4.degrees  = 15;
        weatherBox4.meteorological_precipitation = "Cloudy";
        weatherBox4.wind_speed_m_per_sec = 6;
        weatherBox4.atmosphere_pressure_ = 1101.8;
        weatherBox4.weather_overall_description = "Calm Weather";

        System.out.println("Day of the Week:" + weatherBox4.day_of_week);
        System.out.println("Temperature:" + weatherBox4.degrees);
        System.out.println("Precipitation:" +weatherBox4.meteorological_precipitation);
        System.out.println("Wind speed:"+weatherBox4.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +weatherBox4.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ weatherBox4.weather_overall_description);

        Weather weatherBox5= new Weather();


        weatherBox5.day_of_week = "Friday";
        weatherBox5.degrees  = 27;
        weatherBox5.meteorological_precipitation = "Rain and Hurricane";
        weatherBox5.wind_speed_m_per_sec = 80;
        weatherBox5.atmosphere_pressure_ = 1251.8;
        weatherBox5.weather_overall_description = "Terrible weather. We Recommend to stay at home ";

        System.out.println("Day of the Week:" + weatherBox5.day_of_week);
        System.out.println("Temperature:" + weatherBox5.degrees);
        System.out.println("Precipitation:" +weatherBox5.meteorological_precipitation);
        System.out.println("Wind speed:"+weatherBox5.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +weatherBox5.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ weatherBox5.weather_overall_description);

        Weather weatherBox6= new Weather();


        weatherBox6.day_of_week = "Saturday";
        weatherBox6.degrees  = 36;
        weatherBox6.meteorological_precipitation = "Sunny";
        weatherBox6.wind_speed_m_per_sec = 2;
        weatherBox6.atmosphere_pressure_ = 1151.8;
        weatherBox6.weather_overall_description = "High Chance of getting sunstroke, be carefull";

        System.out.println("Day of the Week:" + weatherBox6.day_of_week);
        System.out.println("Temperature:" + weatherBox6.degrees);
        System.out.println("Precipitation:" +weatherBox6.meteorological_precipitation);
        System.out.println("Wind speed:"+weatherBox6.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +weatherBox6.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ weatherBox6.weather_overall_description);


        Weather weatherBox7= new Weather();


        weatherBox7.day_of_week = "Sunday";
        weatherBox7.degrees  = 20 ;
        weatherBox7.meteorological_precipitation = "Foggy";
        weatherBox7.wind_speed_m_per_sec = 5;
        weatherBox7.atmosphere_pressure_ = 1200.8;
        weatherBox7.weather_overall_description = "Optimal weather, Be carefull while driving";

        System.out.println("Day of the Week:" + weatherBox7.day_of_week);
        System.out.println("Temperature:" + weatherBox7.degrees);
        System.out.println("Precipitation:" +weatherBox7.meteorological_precipitation);
        System.out.println("Wind speed:"+weatherBox7.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +weatherBox7.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ weatherBox7.weather_overall_description);



    }
}
