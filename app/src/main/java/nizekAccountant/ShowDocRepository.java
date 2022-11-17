/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nizekAccountant;

import DocModels.NormalDoc;
import ModelManager.Manager;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Lenovo
 */
public class ShowDocRepository extends DashboardMenu implements TableModel  {

   // ArrayList<String> PeopleDoc = new ArrayList<>();
    private ArrayList<String> list = new ArrayList<>();   //change this with your own normalDocList
    Manager manager= new Manager();
    //private List<NormalDoc> normalDocList = new ArrayList<>();
    
   
    
    public ShowDocRepository() {
       docsTable.setModel(this); 
        
    }

    public void showPeopleOncombo() {   //ignore this one
//its for adding people to combo box 
        // for(String person:PeopleDoc){
        //  peopleDocList.addItem(person);
        //  }
    }

    @Override
    public int getRowCount() {

        //return normalDocsList.size();
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 6; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0 -> {
                return "payeeName";
            }
            case 1 -> {
                return "isDebtor";
            }
            case 2 -> {
                return "isCreditor";
            }
            case 3 -> {
                return "dateOfDoc";
            }
            case 4->{
    
                return "cost";
            
            }
            
            case 5 -> {
            return "discription";
        }
            

            default ->
                throw new IndexOutOfBoundsException(String.format("Column index not exist. (%d)", columnIndex));
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0 -> {
                return true;
            }
            case 1 -> {
                return true;
            }
            case 2 -> {
                return true;
            }
            case 3 -> {

                return true;
            }
            default ->
                throw new IndexOutOfBoundsException(String.format("Column index not exist. (%d)", columnIndex));
        }

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        // switch (columnIndex) {
        //   case 0 -> {
        //       return list.get(rowIndex).getPayee();
        //   }
        //   case 1 -> {
        //        return list.get(rowIndex).getIsCreditor();
        //  }
        //   case 2 -> {
        //        return list.get(rowIndex).getIsDebtor();
        //    }
        //  case 3 ->{
        //   return list.get(rowIndex).getDate();
        //      }
        // default ->
        //     throw new IndexOutOfBoundsException(String.format("Column index not exist. (%d)", columnIndex));
        //    
    
    
    return null;
    
    }
       
    
    
    
    //edit table
        
    
    
    
    
    @Override
        public void setValueAt
        (Object aValue, int rowIndex, int columnIndex) {
     
         switch (columnIndex) {
                case 0 -> {
                 //   list.get(rowIndex).setPayee((String) aValue);
                }
                case 1 -> {
                //    list.get(rowIndex).setIsCreditor((boolean) aValue);
                }
                case 2 -> {
                //    list.get(rowIndex).setIsDebtor((boolean) aValue);
                }
                
                case 3 ->{
                
                //list.get(rowIndex).setdateNizek(String) aValue;
                
                }
                
                 case 4 ->{
                
                //list.get(rowIndex).setdateNizek(String) aValue;
                
                }
                  case 5 ->{
                
                //list.get(rowIndex).setCost(String) aValue;
                
                }
                
                 case 6 ->{
                
                //list.get(rowIndex).setDiscription(String) aValue;
                
                }
                
                
                
                
                
                
                default ->
                    throw new IndexOutOfBoundsException(String.format("Column index not exist. (%d)", columnIndex));
            }
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void addTableModelListener
        (TableModelListener l
        
            ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void removeTableModelListener
        (TableModelListener l
        
            ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }


 

//    public String toString() {
//        return "ShowDocLogicRepository{" + "PeopleDoc=" + PeopleDoc + '}';
//        //return list.toString();
//
//    }

}
