import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import FeatureList from './components/FeatureList';
import AddEmployee from './components/AddEmployee';
import Employees from './components/Employees';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={
          <>
          <FeatureList/>
          </>}/>
          <Route path="/addEmployee" element={<AddEmployee/>}/>
          <Route path="/employees" element={<Employees/>}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
