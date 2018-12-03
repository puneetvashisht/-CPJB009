import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'first-comp',
    template: `
        <h2> First Component/Page Contents </h2>
        <p>asdjgl kjsdklg kds<p>
    `
})
export class FirstComponent implements OnInit {

    constructor() { }

    ngOnInit() { 

    }

}