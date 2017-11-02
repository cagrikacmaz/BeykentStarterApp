package com.beykent.cagrikacmaz.beykentstarterapp;

import android.app.Activity;

import java.util.HashMap;

public class ExerciseActivityMapper {
  private static ExerciseActivityMapper singleton;
  private HashMap<String, Class<? extends Activity>> exerciseClassMap;
	
  public ExerciseActivityMapper() {
	  defineExerciseMappings();
  }

  // ExerciseActivityMapper.getExerciseClass("chap1ex1");
  public static Class<? extends Activity> getExerciseClass(String exerciseId) {
	  return getSingleton().exerciseClassMap.get(exerciseId);
  }
  
  private static ExerciseActivityMapper getSingleton() {
	  if (singleton == null) {
		  singleton = new ExerciseActivityMapper();
	  }
	  return singleton;
  }
  
  private void defineExerciseMappings() {
	  exerciseClassMap = new HashMap<String, Class<? extends Activity>>();
	  // Chapter 1: App Fundamentals
	  exerciseClassMap.put("chap1ex1", BasicTextViewActivity.class);
	  // Chapter 2: User Interface
	  exerciseClassMap.put("chap2ex1", LinearLayoutDemoActivity.class);
	  // Chapter 3: View Controls
	  exerciseClassMap.put("chap3ex1", LayoutGravityActivity.class);
	  exerciseClassMap.put("chap3ex2", SimpleListViewActivity.class);
	  // Chapter 4: User Interactions
	  exerciseClassMap.put("chap4ex1", BasicClickHandlersActivity.class);
	  exerciseClassMap.put("chap4ex2", ListViewClicksActivity.class);
	  // Chapter 5: User Flows

	  exerciseClassMap.put("chap5ex1", ImplicitIntentsActivity.class); // Implicit Intents


	  // Chapter 6: Networking
	  exerciseClassMap.put("chap6ex1", BasicImageDownloadActivity.class); // Basic Image Download


	  // Chapter 7: Advanced Views
	  exerciseClassMap.put("chap7ex1", ToastFormInputsActivity.class); // Toast Inputs

	  exerciseClassMap.put("chap7ex2", TimePickerDemoActivity.class); // TimePicker

	  exerciseClassMap.put("chap7ex3", GridViewDemoActivity.class); // GridView
	  // Chapter 8: Preferences

	  // Chapter 9: ContentProviders

	  // Chapter 10: Publishing

  }
}
