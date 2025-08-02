import React from "react";
import './styles.css';

function OfficeSpace() {
    const element = "Office Space";
    const office_img = <img src="/office.jpeg" width = "40%" height = "25%" alt = "Office image"/>;
    const info = {Name : "DBS", Rent : 50000, Address : "Chenni"};
    let colors = [];
    if(info.Rent <= 60000) {
        colors.push('textRed');
    }else{
        colors.push('textGreen');
    }

    const textColorClass = colors[0];
    return (
        <div>
            <h1>{element}, at Affordable Range</h1>
            {office_img}
            <h1>Name : {info.Name}</h1>
            <h3 className={textColorClass}>Rent : Rs.{info.Rent}</h3>
            <h3>Address : {info.Address}</h3>
        </div>
    );
}

export default OfficeSpace;