import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(items:any[],value: string, label:string): any[] {
    if(!value) return items;
    if(!items) return [];
    if(value==''||value==null) return [];
    return items.filter(e=>e[label].toLowerCase().indexOf(value)>-1);
  }

}
