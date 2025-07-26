import logo from './logo.svg';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
    return (
        <div className='App'>
            <CalculateScore Name="Arnab Chattopadhyay" School="Bharatiya Vidya Bhavan" Total={450} Goal={5} />
        </div>
    );
}

export default App;
