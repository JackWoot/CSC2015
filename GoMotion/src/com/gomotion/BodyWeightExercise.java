package com.gomotion;

import java.sql.*;

public class BodyWeightExercise extends Exercise
{
    public enum BodyWeightType{PUSHUPS, SITUPS, DIPS, OTHER};
	
	private int sets;
	private int reps;
	private BodyWeightType type;
	private String name = null;

	public BodyWeightExercise(ResultSet r) throws SQLException
	{
		//ID
		ID = r.getInt(0);
		//timeStamp
		timeStamp = r.getInt(1);
		//user
		userID = r.getInt(2);
		//sets
		sets = r.getInt(3);
		//reps
		reps = r.getInt(4);
		//type
		type = BodyWeightType.values()[r.getInt(5)];
		//name
		name = r.getString(6);
	}
	
	public BodyWeightExercise(int sets, int reps, BodyWeightType type)
	{
		this.sets = sets;
		this.reps = reps;
		this.type = type;
	}
	
	public BodyWeightExercise(int sets, int reps, BodyWeightType type, String name)
	{
		this.sets = sets;
		this.reps = reps;
		this.type = type;
		this.name = name;
	}

	public BodyWeightExercise(int ID, long timeStamp, int sets,
			int reps, BodyWeightType type)
	{
		this.ID = ID;
		this.timeStamp = timeStamp;
		
		this.sets = sets;
		this.reps = reps;
		this.type = type;
	}

	public int getReps()
	{
		return reps;
	}

	public void setReps(int reps)
	{
		this.reps = reps;
	}

	public int getSets()
	{
		return sets;
	}

	public void setSets(int sets)
	{
		this.sets = sets;
	}

	public BodyWeightType getType()
	{
		return type;
	}

	public void setType(BodyWeightType type)
	{
		this.type = type;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}