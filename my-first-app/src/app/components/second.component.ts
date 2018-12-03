import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'second-comp',
    template: `
        <h2> Second Component/Page Contents </h2>
        <p>asdjgl kjsdklg kds<p>
    `
})
export class SecondComponent implements OnInit {

    constructor() { }

    ngOnInit() { 

    }

}