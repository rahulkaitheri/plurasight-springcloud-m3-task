package plurasight.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import plurasight.demo.entity.Activity;
import plurasight.demo.repository.ActivityRepository;

@SpringBootApplication
@EnableTask
public class PlurasightSpringcloudM3TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlurasightSpringcloudM3TaskApplication.class, args);
	}
	
	@Bean
	public TollprocessoringTask tollprocessoringTask()
	{
		return new TollprocessoringTask();
	}
	
	@Autowired
	ActivityRepository activityRepository ;
	
	public class TollprocessoringTask implements CommandLineRunner{

		@Override
		public void run(String... strings) throws Exception {
			

			if (null != strings)
			{
				Activity activity = new Activity();
				System.out.println("lenght of argement is ->" + strings.length);
				String stationId= strings[1];
				String plate = strings[2];
				String timestamp = strings[3];
				activity.setStationId(stationId);
				activity.setPlate(plate);
				activity.setDate(timestamp);
				activityRepository.save(activity);
				
				System.out.println("stationId->" + stationId);
				System.out.println("plate->" + plate);
				System.out.println("timestamp->" + timestamp);
				
				
			}
			
		}
		
		
	}
	
}
