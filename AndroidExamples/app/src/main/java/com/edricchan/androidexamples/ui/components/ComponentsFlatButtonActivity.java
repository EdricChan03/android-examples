package com.edricchan.androidexamples.ui.components;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.edricchan.androidexamples.R;

public class ComponentsFlatButtonActivity extends AppCompatActivity {
	public static void start(@NonNull Activity activity) {
		Intent intent = new Intent(activity, ComponentsFlatButtonActivity.class);
		activity.startActivity(intent);
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_components_flat_button);
	}
}