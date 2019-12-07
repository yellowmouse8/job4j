package ru.job4j.poly;
import ru.job4j.models.Item;
import ru.job4j.start.Tracker;

      public enum TrackerSingleTon {
          ADD;
          private Tracker tracker = new Tracker();

          public Item add(Item item){
              return tracker.add(item);
          }
          public Item[] findAll(){
              return tracker.findAll();
          }
          public Item[] findByName(String key){
              return tracker.findByName(key);
          }
          public static void main (String[]args){
              TrackerSingleTon trackerSingleTon = TrackerSingleTon.ADD;
          }
  }
