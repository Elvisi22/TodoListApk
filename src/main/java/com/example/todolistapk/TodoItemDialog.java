package com.example.todolistapk;

import com.example.todolistapk.datamodel.TodoData;
import com.example.todolistapk.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class TodoItemDialog {
   @FXML
    private TextField shortDescriptionField;
   @FXML
   private TextArea detailsArea;
   @FXML
   private DatePicker deadlinePicker;

   public TodoItem processResult(){
       String shortDescription = shortDescriptionField.getText().trim();
       String details = detailsArea.getText().trim();
       LocalDate deadlineValue = deadlinePicker.getValue();
       TodoItem newItem = new TodoItem(shortDescription,details,deadlineValue);
       TodoData.getInstance().addTodoItem(newItem);
       return newItem;
   }
}
