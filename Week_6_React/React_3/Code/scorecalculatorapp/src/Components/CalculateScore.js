import '../Stylesheets/mystyle.css';

const percentToDecimal = (decimal) => {
    return (decimal.toFixed(2) + '%');
};

const calScore = (total, goal) => {
    return percentToDecimal(total / goal);
};

export const calculateScore = ({ Name, School, total, goal }) => {
    return (
        <div className="formatstyle">
            <h1 style={{ color: "brown" }}>Student Details :</h1>
            <div className="Name">
                <b><span>Name: </span></b>
                <span>{Name}</span>
            </div>
            <div className="School">
                <b><span>School: </span></b>
                <span>{School}</span>
            </div>
            <div className="Total">
                <b><span>Total: </span></b>
                <span>{total} Marks</span>
            </div>
            <div className="Score">
                <b><span>Score: </span></b>
                <span>{calScore(total, goal)}</span>
            </div>
        </div>
    );
};

export default calculateScore;
