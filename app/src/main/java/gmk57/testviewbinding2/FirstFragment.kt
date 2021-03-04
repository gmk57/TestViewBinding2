package gmk57.testviewbinding2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import gmk57.testviewbinding2.databinding.FragmentBinding

class FirstFragment : Fragment(R.layout.fragment) {
    private val binding by viewBinding(FragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = "First"
    }
}
