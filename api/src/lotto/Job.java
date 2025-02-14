package lotto;

import java.util.Objects;

public class Job {
	private String job;
	
	public Job() {;}

	public Job(String job) {
//		super();
		this.job = job;
	}
	

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	

	@Override
	public String toString() {
		return "Job [job=" + job + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(job);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		return Objects.equals(job, other.job);
	}

	
}
