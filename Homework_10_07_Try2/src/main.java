import weather.days.friday.Friday;
import weather.days.monday.Monday;
import weather.days.saturday.Saturday;
import weather.days.sunday.Sunday;
import weather.days.thursday.Thursday;
import weather.days.tuesday.Tuesday;
import weather.days.wednesday.Wednesday;

public class main {
    public static void main(String[] args) {
        Friday Friday_weather = new Friday();

        System.out.println("Day of the Week:" + Friday_weather.day_of_week);
        System.out.println("Temperature :" + Friday_weather.degrees);
        System.out.println("Precipitation:" + Friday_weather.meteorological_precipitation);
        System.out.println("Wind speed:" +Friday_weather.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +Friday_weather.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ Friday_weather.weather_overall_description);

        Thursday Thursday_weather = new Thursday();

        System.out.println("Day of the Week:" + Thursday_weather.day_of_week);
        System.out.println("Temperature :" + Thursday_weather.degrees);
        System.out.println("Precipitation:" +Thursday_weather.meteorological_precipitation);
        System.out.println("Wind speed:"+Thursday_weather.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +Thursday_weather.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ Thursday_weather.weather_overall_description);

        Monday Monday_weather = new Monday();

        System.out.println("Day of the Week:" + Monday_weather.day_of_week);
        System.out.println("Temperature :" + Monday_weather.degrees);
        System.out.println("Precipitation:" +Monday_weather.meteorological_precipitation);
        System.out.println("Wind speed:"+Monday_weather.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +Monday_weather.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ Monday_weather.weather_overall_description);

        Tuesday Tuesday_weather = new Tuesday();

        System.out.println("Day of the Week:" + Tuesday_weather.day_of_week);
        System.out.println("Temperature :" + Tuesday_weather.degrees);
        System.out.println("Precipitation:" +Tuesday_weather.meteorological_precipitation);
        System.out.println("Wind speed:"+Tuesday_weather.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +Tuesday_weather.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ Tuesday_weather.weather_overall_description);


        Sunday Sunday_weather = new Sunday();

        System.out.println("Day of the Week:" + Sunday_weather.day_of_week);
        System.out.println("Temperature :" + Sunday_weather.degrees);
        System.out.println("Precipitation:" +Sunday_weather.meteorological_precipitation);
        System.out.println("Wind speed:"+Sunday_weather.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +Sunday_weather.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ Sunday_weather.weather_overall_description);


        Saturday Saturday_weather = new Saturday();

        System.out.println("Day of the Week:" + Saturday_weather.day_of_week);
        System.out.println("Temperature :" + Saturday_weather.degrees);
        System.out.println("Precipitation:" +Saturday_weather.meteorological_precipitation);
        System.out.println("Wind speed:"+Saturday_weather.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +Saturday_weather.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ Saturday_weather.weather_overall_description);

        Wednesday Wednesday_weather = new Wednesday();

        System.out.println("Day of the Week:" + Wednesday_weather.day_of_week);
        System.out.println("Temperature :" + Wednesday_weather.degrees);
        System.out.println("Precipitation:" +Wednesday_weather.meteorological_precipitation);
        System.out.println("Wind speed:"+Wednesday_weather.wind_speed_m_per_sec);
        System.out.println("Atmosphere Pressure:" +Wednesday_weather.atmosphere_pressure_);
        System.out.println( "How it is Outside? -  "+ Wednesday_weather.weather_overall_description);











    }
}