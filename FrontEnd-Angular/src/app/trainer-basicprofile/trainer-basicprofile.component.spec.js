"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var testing_1 = require("@angular/core/testing");
var trainer_basicprofile_component_1 = require("./trainer-basicprofile.component");
describe('TrainerBasicprofileComponent', function () {
    var component;
    var fixture;
    beforeEach(testing_1.async(function () {
        testing_1.TestBed.configureTestingModule({
            declarations: [trainer_basicprofile_component_1.TrainerBasicprofileComponent]
        })
            .compileComponents();
    }));
    beforeEach(function () {
        fixture = testing_1.TestBed.createComponent(trainer_basicprofile_component_1.TrainerBasicprofileComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });
    it('should create', function () {
        expect(component).toBeTruthy();
    });
});
//# sourceMappingURL=trainer-basicprofile.component.spec.js.map