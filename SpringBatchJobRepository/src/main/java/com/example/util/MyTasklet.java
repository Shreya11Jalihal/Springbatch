package main.java.com.example.util;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.jdbc.core.JdbcTemplate;

public class MyTasklet implements Tasklet {

	private DataSource dataSource;
	private String sql = "Select firstName,lastName,school,rollnumber from Person_Details";
	
	public RepeatStatus execute(StepContribution contribution,
            ChunkContext chunkContext) throws Exception
	{
		List<Person_Details> persondetails =new ArrayList();
		JdbcTemplate mytemplate=new JdbcTemplate(getDataSource());
		persondetails =mytemplate.query(sql,new PersonMapper());
		for(Person_Details per: persondetails)
		{
			System.out.println(per.toString());
		}
		return RepeatStatus.FINISHED;
		
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
