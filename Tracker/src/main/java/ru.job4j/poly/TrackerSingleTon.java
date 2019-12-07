package ru.job4j.poly;
import ru.job4j.models.Item;
import ru.job4j.start.Tracker;

      public enum TrackerSingleTon {
          ADD,REPLACE,DELETE;
          private Tracker tracker = new Tracker();

          public Item add(Item item){
              return tracker.add(item);
          }
          public boolean replace(String id, Item item){
              return tracker.replace(id, item);
          }
          public boolean delete(String id){
              return tracker.delete(id);
          }
          public static void main (String[]args){
              TrackerSingleTon trackerSingleTon = TrackerSingleTon.ADD,DELETE,REPLACE;

          }
  }
